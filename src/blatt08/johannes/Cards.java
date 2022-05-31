package blatt08.johannes;

public class Cards {
	enum cardColors{
		KARO, HERZ, PIK, KREUZ
	}
	
	static int colorValue(cardColors color) {
		int value = 0;
		switch(color) {
		case KARO:
			value = 9;
			break;
		case HERZ://cardColors.HERZ
			value = 10;
			break;
		case PIK:
			value = 12;
			break;
		case KREUZ:
			value = 12;
			break;
		default:
			value = 0;//Error
			break;//sinvoll?
		}
		return value;
	}
	
	public static void main(String[] args) {
		System.out.println(colorValue(cardColors.HERZ));
	}

}
