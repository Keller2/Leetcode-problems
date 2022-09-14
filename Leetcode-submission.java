class Solution {
    public int romanToInt(String s) {
        
        int a = 0;
        int total = 0;
        int isfirstnumtf = 0; 
        Map<Character, Integer> input = new HashMap();
        input.put('I',1);
        input.put('V',5);
        input.put('X',10);
        input.put('L',50);
        input.put('C',100);
        input.put('D',500);
        input.put('M',1000);
        for(int num = 0; num < s.length(); num++){
            if(num > 0 && input.get(s.charAt(num)) > input.get(s.charAt(num - 1)))
            {
                    total = total + input.get(s.charAt(num)) - input.get(s.charAt(num - 1)) - input.get(s.charAt(num - 1));
                    System.out.println(input.get(s.charAt(num)));
            }
            else{
                total = total + input.get(s.charAt(num));
            }
           
          //if(num > 0 && input.get(s.charAt(num)) > input.get(s.charAt(num - 1))){
                //total = total + s.charAt(num);
            
        }
        return total;
        }

}
    
        