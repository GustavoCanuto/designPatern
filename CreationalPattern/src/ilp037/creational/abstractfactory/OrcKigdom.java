package ilp037.creational.abstractfactory;

public class OrcKigdom implements KingdomFactory {

	@Override
	public Army createArmy() {
		return new OrcArmy();
	}

	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}

	@Override
	public King createKing() {
		return new OrcKing();
	}

}
