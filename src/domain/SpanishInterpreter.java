package domain;

import java.util.Map;

public class SpanishInterpreter extends AbsInterpreter implements Interpreter {
	
//	StringBuilder sb;
	
	public SpanishInterpreter(Map<String, String> codelang) {
		super(codelang);
//		this.sb = sb;
	}

	@Override
	public String[][] initialize(String[][] table) {
//		String[] weekDays = getWeekDays();
//		String[] measureOfTime = getTimeMask();
//		for(int i = 0; i<2; i++){
//			for(int j = 0; j<8; j++){
//				if(table[i][j] == table[0][0]){
//					table[0][0] = measureOfTime[2];
//				}
//				else{
//					table[i][j] = weekDays[j];
//				}
//			}
//		}
		
		String[][] tmp = table;
		String[] weekDays = getWeekDays();
		String[] measureOfTime = getTimeMask();
		
		table[0][0] = measureOfTime[2];
		 for (int i = 0; i < weekDays.length; i++) 
		 { System.arraycopy(weekDays[i], 0, tmp[i], 1, weekDays[0].length()-1); }
		 
		 return tmp;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
}