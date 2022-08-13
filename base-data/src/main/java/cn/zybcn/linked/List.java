package cn.zybcn.linked;

/**
 * @Author ZhangYiBo
 * @Date 2022-08-13 22:18
 */
public interface List<E> {


    boolean add(E e);

    boolean addFirst(E e);

    boolean addLast(E e);

    boolean remove(Object o);

    E get(int index);

    void printLinkList();

}
