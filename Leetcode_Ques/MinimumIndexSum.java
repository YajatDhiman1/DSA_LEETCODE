class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> lk = new ArrayList<>();
        int idx = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int id = i + j;

                    if (id < idx) {
                        idx = id;
                        lk.clear();
                        lk.add(list1[i]);
                    } else if (id == idx) {
                        lk.add(list1[i]);
                    }
                }
            }
        }

        return lk.toArray(new String[0]);
    }
}