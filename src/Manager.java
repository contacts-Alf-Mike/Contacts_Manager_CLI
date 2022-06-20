public class Manager {
    private String contactName;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void addNewItem(Manager m){
        this.contactName = m.contactName;
    }
}
