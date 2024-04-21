class Solution {
    public int evalRPN(String[] nums) {
        Stack<String> stack = new Stack<>();
        for( int i=0;i< nums.length;i++)
        {
            if(nums[i].equals("+")){
                String str2 = stack.pop();
                String str1= stack.pop();
                int num2=Integer.parseInt(str2);
                int num1=Integer.parseInt(str1);
                int res=num1+num2;
                stack.push(Integer.toString(res));
            }
            else if(nums[i].equals("-")){
                String str2 = stack.pop();
                String str1= stack.pop();
                int num2=Integer.parseInt(str2);
                int num1=Integer.parseInt(str1);
                int res=num1-num2;
                stack.push(Integer.toString(res));
            }
           else if(nums[i].equals("*")){
                String str2 = stack.pop();
                String str1= stack.pop();
                int num2=Integer.parseInt(str2);
                int num1=Integer.parseInt(str1);
                int res=num1*num2;
                stack.push(Integer.toString(res));
            }
           else if(nums[i].equals("/")){
                String str2 = stack.pop();
                String str1= stack.pop();
                int num2=Integer.parseInt(str2);
                int num1=Integer.parseInt(str1);
                int res=num1/num2;
                stack.push(Integer.toString(res));
            }
            else
            stack.push(nums[i]);
        }
        return Integer.parseInt(stack.peek());
        
    }
}