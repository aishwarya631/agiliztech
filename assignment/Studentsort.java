package com.at.example.assignment;
import java.util.Comparator;
import java.util.Objects;

public class Studentsort  implements Comparable<Studentsort>{
		 String sname;
		 int sid;
		 int marks;
		 String grade;
		public Studentsort(String sname, int sid, int marks,String grade) {
			super();
			this.sname = sname;
			this.sid = sid;
			this.marks = marks;
			this.grade = grade;
		}
		/**
		 * @return the sname
		 */
		public String getSname() {
			return sname;
		}
		/**
		 * @param sname the sname to set
		 */
		public void setSname(String sname) {
			this.sname = sname;
		}
		/**
		 * @return the sid
		 */
		public int getSid() {
			return sid;
		}
		/**
		 * @param sid the sid to set
		 */
		public void setSid(int sid) {
			this.sid = sid;
		}
		/**
		 * @return the marks
		 */
		public int getMarks() {
			return marks;
		}
		/**
		 * @param marks the marks to set
		 */
		public void setMarks(int marks) {
			this.marks = marks;
		}
		/**
		 * @return the sage
		 */
		public String getgrade() {
			return grade;
		}
		/**
		 * @param sage the sage to set
		 */
		public void setSage(String sage) {
			this.grade = grade;
		}
		@Override
		public String toString() {
			return "Studentsort [sname=" + sname + ", sid=" + sid + ", marks=" + marks + ", grade=" + grade + "]";
		}
		@Override
		public int compareTo(Studentsort o) {
			// TODO Auto-generated method stub
			return this.sid-o.sid;
		}
		@Override
		public int hashCode() {
			return Objects.hash(marks, grade, sid, sname);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Studentsort other = (Studentsort) obj;
			return marks == other.marks && grade == other.grade && sid == other.sid && Objects.equals(sname, other.sname);
		}
		
	
			
		
}		