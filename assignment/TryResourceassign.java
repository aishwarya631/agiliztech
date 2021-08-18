package com.at.example.assignment;

import java.io.FileOutputStream;

public class TryResourceassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fileOutputStream = new FileOutputStream(
				"C:\\java core\\Agilizproject\\src\\com\\at\\example\\assignment\\abc.txt")) {
			String msg = "Welcome to javaTpoint! ";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}

	}

}
