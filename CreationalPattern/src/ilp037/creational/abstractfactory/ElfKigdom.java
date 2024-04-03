package ilp037.creational.abstractfactory;

public class ElfKigdom implements KingdomFactory {

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

}
