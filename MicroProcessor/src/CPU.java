
public class CPU {
	public enum EDeviceId {
		eCpu,
		eMemory
	}
	
	public enum EOpCode {
		eMove,
		eAdd
	}
	 
	// components
	enum ERegisters { 
		eMAR,
		eMBR,
		ePC,
		eIR,
		eAC
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
	
	private void move(ERegisters eTarget, ERegisters eSource) {
		registers[eTarget.ordinal()] = registers[eSource.ordinal()];
	}
	private int get(ERegisters eRegister) {
		return registers[eRegister.ordinal()];
	}
	private void set(ERegisters eRegister, int value) {
		registers[eRegister.ordinal()] = value;
	}

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
