class MinimumCostOfRopes {
    public long minCost(long[] arr) {
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for(long rope : arr) pq.add(rope);
    long res = 0;
    while(pq.size()>1){
        long c = pq.remove() + pq.remove();
        res += c;
        pq.add(c);
    }
    return res;
   }
}