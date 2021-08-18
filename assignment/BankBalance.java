package com.at.example.assignment;

class Balance {
	int amount;

	Balance(int amount) {
		this.amount = amount;
	}
}

public class BankBalance {
	public Balance checkAmount(int amount) throws NoBalance {
		if (amount == 0) {
			throw new NoBalance(" account is empty");
		}
		return new Balance(amount);
	}

	public static void main(String[] args) throws NoBalance {
		BankBalance money = new BankBalance();
		Balance balance = money.checkAmount(0);

	}

}
