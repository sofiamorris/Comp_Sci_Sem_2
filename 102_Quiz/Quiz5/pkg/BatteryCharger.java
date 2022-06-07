package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	private int[] rateTable;
	public int getChargingCost(int startHour, int chargeTime){
		int cost = 0;
		if (startHour >= 0 && startHour <= 23 && chargeTime > 0){
			for (int hour = 0; hour <= chargeTime; hour++){
				cost = cost + rateTable[hour + startHour];
			}
		return cost;
	}
	public int getChargeStartTime(int chargeTime){
		int startTime = -1;
		if (chargeTime = 3){
			startTime = 23
		}
		else if (chargeTime = 4){
			startTime = 22;
		}
		else if (chargeTime > 0){
			for (hour = 0; hour < rateTable.length; hour++){
				if (rateTable[hour] < rateTable[hour + 1] && rateTable[hour + 1] < rateTable[hour + 2]){
					startTime = hour;
				}
			}
		}
		return startTime;
	}