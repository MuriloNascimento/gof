package pattern.objectpool;

public interface Pool<T> {
	T acquire();
	void release(T t);
}
