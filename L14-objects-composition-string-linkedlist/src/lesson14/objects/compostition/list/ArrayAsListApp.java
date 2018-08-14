package lesson14.objects.compostition.list;

public class ArrayAsListApp {
	public static void main(String[] args) {
		ArrayAsList list = new ArrayAsList(1000); //new list[1000], 1000 - это максимум элементов.
		list.get(10); //должен работать как list[10] в массиве. В случае невозможности возврат -1
		list.set(2, 12); // list[12] = 2
		list.size(); //returns текущий размер (как индекс полсденего элемента +1)
		list.addFirst(99);
		list.addLast(99);
		list.insertBefore(99, 12); //всунуть 99 по индексу 12, а 12-й уходит вправо.
		list.remove(12); //по индексу
	}
}
