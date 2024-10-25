package _2022_1;

class BankAccount { // 은행 계좌 
	int accountNumber;  // 계좌 번호 
	String owner; // 에금주 
	int balance; // 잔액 표시 변수 
	
	void deposit(int amount ) { // 저금 
		balance += amount;
	}
	void withdraw(int amount) { // 인출 
		balance -= amount;
	}
	public String toString() {
		return "현재 잔액은 " + balance + "원 입니다.";
	}
}

public class _08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
	}

}
