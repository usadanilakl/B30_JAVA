package day35_Collection.customStack;

import java.util.*;

public class Sunset {
    public static ArrayList<Integer> sunsetViews(Integer[] buildings, String direction){
        StackList<Integer> b = new StackList<>();
        ArrayList<Integer> r = new ArrayList<>();
        if(direction.toLowerCase().equals("east")){
            for(int i = 0; i<buildings.length-1; i++){
                boolean isToller = true;
                for(int j = i+1; j<buildings.length-1; j++){
                    if(buildings[i]<=buildings[j]){
                        isToller = false;
                    }
                }
                if(isToller) r.add(i);
            }
            r.add(buildings.length-1);
            return r;
        }else{
            for(int i = buildings.length-1; i>0; i--){
                boolean isToller = true;
                for(int j = i-1; j>-1; j--){
                    if(buildings[i]<=buildings[j])
                        isToller = false;
                }
                if(isToller) r.add(i);
            }
            r.add(0);
            Collections.sort(r);
            return r;
        }

    }
    public static ArrayList<Integer> sun(int[] buildings, String direction){
        StackList<Integer> num = new StackList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(direction.toLowerCase().equals("east")){
            num.push(buildings[0]);
            res.add(0);
            for(int i = 1; i<buildings.length; i++){
                while(num.peek() != null && (int)num.peek().data <= buildings[i]){
                    num.pop();
                    res.remove(res.size()-1);
                }
                num.push(buildings[i]);
                res.add(i);
            }
        }else{
            num.push(buildings[buildings.length-1]);
            res.add(buildings.length-1);
            for(int i = buildings.length-2; i>=0; i--){
                while (num.peek() != null && (int)num.peek().data<=buildings[i]){
                    num.pop();
                    res.remove(res.size()-1);
                }
                num.push(buildings[i]);
                res.add(i);
            }
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sunsetViews(new Integer[]{3, 5, 4, 4, 3, 1, 8, 3, 2}, "west"));
        System.out.println(sun(new int[]{3, 5, 4, 4, 3, 1, 8, 3, 2}, "eastt"));

    }
}
