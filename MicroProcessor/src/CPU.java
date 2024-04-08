
public class CPU {
	public enum EDeviceId {
		eCpu,
		eMemory
	}
	
	public enum EOpCode {
		eMove,
		eAdd
	}
	public enum EStatus {
		eZero(0xFE, 0x01, 0x01);
		
		private int nClear;
		private int nSet;
		private int nGet; 
		private EStatus(int nClear, int nSet, int nGet) {
			this.nClear = nClear;
			this.nClear = nSet;
			this.nGet = nGet;
		}
		public int getNClear() { return this.nClear; }
		public int getNSet() { return this.nSet; }
		public int getNGet() { return this.nGet; }
	}
	 
	// components
	enum ERegisters { 
		eMAR,
		eMBR,
		ePC,
		eIR,
		eAC,
		eStatus
	}	
	int registers[] = new int[ERegisters.values().length];
	
	// associations
	private Bus bus;
	
	public CPU() {
		// TODO Auto-generated constructor stub
	}
	public void associate(Bus bus) {
		this.bus = bus;
	}
	
	public void initialize() {
	}
	
	private int get(ERegisters eRegister) {
		return registers[eRegister.ordinal()];
	}
	private void set(ERegisters eRegister, int value) {
		registers[eRegister.ordinal()] = value;
	}
	
	private void setZero(boolean bResult) {
		if (bResult) {
			this.registers[ERegisters.eStatus.ordinal()] 
				= this.registers[ERegisters.eStatus.ordinal()] & EStatus.eZero.getNClear();
		} else {
			this.registers[ERegisters.eStatus.ordinal()] 
					= this.registers[ERegisters.eStatus.ordinal()] | EStatus.eZero.getNSet();
		}
	}
	private boolean getZero() {
		return true;
	}
	private void setMinus(boolean bResult) {
		
	}
	
	// instructions
	private void move(ERegisters eTarget, ERegisters eSource) {
		registers[eTarget.ordinal()] = registers[eSource.ordinal()];
	}

	
	// instruction execution cycle
	private void fetch() {
		move(ERegisters.eMAR, ERegisters.ePC);
		set(ERegisters.eMBR, bus.load(EDeviceId.eMemory, get(ERegisters.eMAR)));
		move(ERegisters.eIR, ERegisters.eMBR);
	}	
	private void decode() {
		int opCode = get(ERegisters.eIR) >> 24;
		if (opCode == EOpCode.eMove.ordinal()) {
			int operand1 = get(ERegisters.eIR) & 0x00FF0000;
			operand1 = operand1 >> 16;
			int operand2 = get(ERegisters.eIR) & 0x0000FF00;
			operand2 = operand2 >> 8;
			move(ERegisters.values()[operand1], ERegisters.values()[operand2]);
		} else if (opCode == EOpCode.eAdd.ordinal()) {
			
		}		
	}
	private void execute() {
	}
	
	public void run() {
		this.fetch();
		this.decode();
		this.execute();
	}

	public void finish() {
	}



}
