public class DefangingAnIPAddressSolution {
    public String defangIPaddr(String address) {
        String result = "";
        int size = address.length();
        for(int i = 0; i < size; i++) {
            if(address.charAt(i) == '.') {
                result += "[.]";
            }
            else {
                result += address.charAt(i);
            }
        }
        return result;
    }
}
