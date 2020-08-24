import java.util.ArrayList;

public class MonsterPool {
	private int maxSize = 10;
	private ArrayList<Monster> monsterPool = new ArrayList<Monster>();
	private static MonsterPool singleton;
	
	private MonsterPool() {
		monsterPool.add(new Slime(50, 2));
		monsterPool.add(new Slime(25, 4));
		monsterPool.add(new Slime(15, 6));
	}
	
	public static MonsterPool getInstance() {
		if (singleton == null) {
			singleton = new MonsterPool();
		}
		return singleton;
	}
	
	public void addMonster(Monster m) {
		if (monsterPool.size() < this.maxSize) {
			monsterPool.add(m);
		} else {
			System.out.print("Pool is full");
		}
	}
	
	public int getSize() {return monsterPool.size();}
	
	public Monster getMonster(int index) {
		if (monsterPool.size() > 0) {
			return monsterPool.get(index);
		} else {
			System.out.print("New MON in poold");
			monsterPool.add(new Slime(20, 2));
			return monsterPool.get(index);
		}
		
	}
}
