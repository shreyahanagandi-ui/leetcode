class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                temp.add(ncr(i, j));
            }

            list.add(temp);
        }

        return list;
    }

    public int ncr(int n, int r) {
        int res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }

        return res;
    }
}