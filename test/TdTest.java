import org.junit.Test;

/**
 * 功能：
 *
 * @author 蓝田_Loto
 * @time 2018-05-09 02:01
 **/

public class TdTest {

    // 左移
    @Test
    public void test1(String[] args) {
        int newCapacity = 10 + (10 >> 1);
        System.out.println(newCapacity);
    }

    // 数组异常
    @Test
    public  void test2() {
        int[] a = {1,2,3,4,5};

        System.out.println(a[6]);
    }
}


// 2018.05.09
// ArrayList：底层是数组
// add - 指定位置插入
// 判断要插入的数组元素的位置是否合法
// 确认数组的最后一个元素的下标
// 复制数组：范围是从插入位置到最后一个元素
// 逆序遍历：范围是从最后一个元素到插入位置
// 把要插入的元素赋值到数组元素中


// 2018.05.10
// LinkedList - 双向链表
// linkFirst - 头插
// Node类：
//    E item  域值
//    Node<E> next;  域指针
//    Node<E> prev;  域指针

// 单链表 没在jdk中找到

// Arrays - 操作数组的工具类
// 删除元素、修改元素、排序（归并、冒泡、选择、快排）、查找（二分查找）、比较、

