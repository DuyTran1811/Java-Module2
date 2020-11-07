package day12DataStructuresJavaCollectionFramework.TH1.TimKiemNhiPhan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
    public interface Tree<E>{
        /**
         * Chèn phần tử e vào cây tìm kiếm nhị phân.
          Trả về true nếu phần tử được chèn thành công */
        boolean insert(E e);
        /**
        * Inorder traversal từ gốc */
        void inorder();
        /**
         * Lấy số lượng nút trong cây*/
        int getSize();
    }
}
