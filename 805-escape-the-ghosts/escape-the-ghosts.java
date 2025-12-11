class Solution {
    private int dist(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int myDist = dist(new int[]{0, 0}, target);

        for (int[] ghost : ghosts) {
            if (dist(ghost, target) <= myDist) return false;
        }

        return true;
    }
}