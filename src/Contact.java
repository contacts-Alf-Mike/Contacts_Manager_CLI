public class Contact {
    private String contactName;

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    Contact(){}

    Contact(String contactName, String phoneNumber){
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getInfo(){

        return this.contactName + "\t| " + this.phoneNumber;
    }


}
