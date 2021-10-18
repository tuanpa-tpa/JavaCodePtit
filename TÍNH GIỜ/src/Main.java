
import java.util.*;
import java.text.*;

class gamer {
	private String id;
	private String name;
	private String firstTime;
	private String secondTime;
	private long hours;
	private long minutes;

	public gamer() {
		this("", "", "00:00", "00:00");
		this.hours = 0;
		this.minutes = 0;
	}

	public gamer(String id, String name, String firstTime, String secondTime) {
		this.id = id;
		this.name = name;
		this.firstTime = firstTime;
		this.secondTime = secondTime;
	}

	public void setHours(long hours) {
		this.hours = hours;
	}

	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}

	public long getHours() {
		return hours;
	}

	public long getMinutes() {
		return minutes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getSecondTime() {
		return secondTime;
	}

	public void setSecondTime(String secondTime) {
		this.secondTime = secondTime;
	}
	
	public void convertName() {
		StringTokenizer stringTokenizer = new StringTokenizer(name);
		StringBuilder stringBuilder = new StringBuilder();
		while (stringTokenizer.hasMoreTokens()) {
			String str = stringTokenizer.nextToken().toLowerCase();
			stringBuilder.append(String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ");
		}
		name = stringBuilder.toString();
	}

	public void convertTime() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		try {
			Date date1 = format.parse(firstTime);
			Date date2 = format.parse(secondTime);
			long difference = date2.getTime() - date1.getTime();
			setMinutes(difference / (60 * 1000) % 60);
			setHours(difference / (60 * 60 * 1000) % 24);
		} catch (Exception ignored) {

		}
	}

	@Override
	public String toString() {
		return String.format("%s %s%d gio %d phut", id, name, hours, minutes);
	}

}

public class Main {

	public static void main(String[] args) {
		ArrayList<gamer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while (t-- > 0) {
			gamer game = new gamer();
			game.setId(scanner.nextLine());
			game.setName(scanner.nextLine());
			game.setFirstTime(scanner.nextLine());
			game.setSecondTime(scanner.nextLine());
			game.convertName();
			game.convertTime();
			list.add(game);
		}

		Collections.sort(list, new Comparator<gamer>() {
			@Override
			public int compare(gamer o1, gamer o2) {
				if (o1.getHours() > o2.getHours())
					return -1;
				else if (o1.getHours() < o2.getHours())
					return 1;
				else {
					if (o1.getMinutes() > o2.getMinutes())
						return -1;
					if (o1.getMinutes() < o2.getMinutes())
						return 1;
				}
				return 1;
			}
		});

		for (gamer game : list) {
			System.out.println(game);
		}

		scanner.close();
	}

}

//String time1 = "09:00";
//String time2 = "10:30";
//
//SimpleDateFormat format = new SimpleDateFormat("HH:mm");
//try {
//	Date date1 = format.parse(time1);
//	Date date2 = format.parse(time2);
//	long difference = date2.getTime() - date1.getTime();
//	long diffMinutes = difference / (60 * 1000) % 60;
//	long diffHours = difference / (60 * 60 * 1000) % 24;
//	System.out.println(String.format("%d %d ",diffHours, diffMinutes ));
//	
//} catch (Exception e) {
//	
//}