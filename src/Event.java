
abstract class Event {
	Player p;
	abstract void goalMID();
	abstract void goalFWD();
	abstract void goalGK();
	abstract void goalDEF();
	abstract void assist();
	abstract void yellowcard();
	abstract void redcard();
	abstract void owngoal();
}
