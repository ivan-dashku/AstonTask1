
public interface SimpleList<E> {

    /**
     * @return количество элементов в списке
     */
    int size();

    /**
     * Добавляет новый элемент в список. При достижении размера внутреннего
     * массива происходит его увеличение в два раза.
     *
     * @param element элемент, который нужно добавить в список
     */
    void add(E element);

    /**
     * Удаляет первое вхождение элемента в список.
     *
     * @param element элемент, который нужно удалить из списка
     */
    void remove(E element);

    /**
     * Удаляет все элементы из списка.
     */
    void Clear();

    /**
     * @param index индекс элемента, который нужно вернуть
     * @return элемент списка по указанному индексу
     */
    E get(int index);

    /**
     * @param index индекс элемента, который нужно заменить
     * @param element элемент который заменяет собой другой в указаном индексе
     * @return новый элемент списка по указанному индексу
     */
    E set(int index, E element);

    /**
     * Добавляет новый элемент в список по индексу.
     *
     * @param element элемент, который нужно добавить в список
     * @param index индекс, по которому нужно добавить элемент
     */
    void add( int index, E element);



    /**
     * Удаляет элемент списка по индексу. Все элементы справа от удаляемого
     * перемещаются на шаг влево. Если после удаления элемента количество
     * элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
     * то внутренний массив уменьшается в два раза, для экономии занимаемого
     * места.
     *
     * @param index индекс элемента, который нужно удалить
     */
    void remove(int index);



}
