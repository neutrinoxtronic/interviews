//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

//For example:
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?

class AddDigits {
    public int addDigits(int num) {
        while(num >= 10) {
            int temp = 0;
            while(num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        
        return num;
    }
	//Answer to followup
	public int addDigits2(int num)
{
	int sum=num%9;
	if(summ==0)
		return 9;
	else
		return sum;
}
}

