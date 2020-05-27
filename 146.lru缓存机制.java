import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU缓存机制
 */

// @lc code=start
class LRUCache {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value;
        synchronized (this) {
            value = map.get(key);
            if(value==null){
                return -1;
            }
            return value;
        }
    }

    public void put(int key, int value) {
        Integer v;
        synchronized (this) {
            v = map.put(key, value);
            if (v != null) {
                return;
            }
        }

        while (true) {
            synchronized (this) {
                if (map.size() <= capacity) {
                    return;
                }

                Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
            

                if (entry == null) {
                    return;
                }
                int editKey = entry.getKey();
                map.remove(editKey);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
// @lc code=end
