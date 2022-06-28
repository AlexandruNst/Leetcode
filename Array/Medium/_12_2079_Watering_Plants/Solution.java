package Array.Medium._12_2079_Watering_Plants;

//T: O(n)
//S: O(1)
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int currentCapacity = capacity;
        for(int i = 0; i < plants.length; i++){
            int plantWater = plants[i];
            if(currentCapacity >= plantWater){
                currentCapacity -= plantWater;
                steps++;
            } else {
                steps += i * 2 + 1;
                currentCapacity = capacity - plantWater;
            }
        }

        return steps;
    }
}
