class Solution {
    public String defangIPaddr(String address) {
        // StringBuilder sb = new StringBuilder(address);
        address = address.replace(".","[.]");
        return address;
    }
}