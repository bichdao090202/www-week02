package vn.edu.iuh.fit.entities;

public class GrantAccess {
    private String roleID;

    private String accountID;

    private int isGrant;

    private String note;

    public GrantAccess() {
    }

    public GrantAccess(String roleID) {
        this.roleID = roleID;
    }

    public GrantAccess(String roleID, String accountID, int isGrant, String note) {
        this.roleID = roleID;
        this.accountID = accountID;
        this.isGrant = isGrant;
        this.note = note;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getIsGrant() {
        return isGrant;
    }

    public void setIsGrant(int isGrant) {
        this.isGrant = isGrant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "roleID='" + roleID + '\'' +
                ", accountID='" + accountID + '\'' +
                ", isGrant=" + isGrant +
                ", note='" + note + '\'' +
                '}';
    }
}
