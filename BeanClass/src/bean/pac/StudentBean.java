package bean.pac;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentBean implements Serializable {
  private String name;
  private String Add;
  private int id;
  private int phone;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return Add;
}
public void setAdd(String add) {
	Add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
   
   
}
