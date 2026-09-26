class FruitsIntoBasketsII {
    int[] tree;
    int n;

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        n = baskets.length;
        tree = new int[4 * n];

        build(1, 0, n - 1, baskets);

        int ans = 0;

        for(int x : fruits) {
            int pos = find(1, 0, n - 1, x);

            if(pos == -1) {
                ans++;
            }
            else {
                update(1, 0, n - 1, pos);
            }
        }

        return ans;
    }

    void build(int node, int l, int r, int[] a) {
        if(l == r) {
            tree[node] = a[l];
            return;
        }

        int mid = l + (r - l) / 2;

        build(node * 2, l, mid, a);
        build(node * 2 + 1, mid + 1, r, a);

        tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
    }

    int find(int node, int l, int r, int x) {
        if(tree[node] < x) {
            return -1;
        }

        if(l == r) {
            return l;
        }

        int mid = l + (r - l) / 2;

        int pos = find(node * 2, l, mid, x);

        if(pos != -1) {
            return pos;
        }

        return find(node * 2 + 1, mid + 1, r, x);
    }

    void update(int node, int l, int r, int pos) {
        if(l == r) {
            tree[node] = -1;
            return;
        }

        int mid = l + (r - l) / 2;

        if(pos <= mid) {
            update(node * 2, l, mid, pos);
        }
        else {
            update(node * 2 + 1, mid + 1, r, pos);
        }

        tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
    }
}
