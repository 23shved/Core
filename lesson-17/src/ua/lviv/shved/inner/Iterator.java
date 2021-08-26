package ua.lviv.shved.inner;

public interface Iterator {
	boolean hasnext();

	Integer next();
}

class Collection {
	private static Integer[] arr;

	Collection(Integer[] arr) {
		Collection.arr = arr;
	}

	public class ForwardIterator implements Iterator {

		private int i = 0;

		@Override
		public boolean hasnext() {
			return i < arr.length;
		}

		@Override
		public Integer next() {
			return arr[i++];
		}

	}

	public ForwardIterator createForward() {
		return new ForwardIterator();
	}

	public class BackwardIterator implements Iterator {

		private int i = arr.length - 1;

		@Override
		public boolean hasnext() {
			return i >= 0;
		}

		@Override
		public Integer next() {
			i -= 2;
			return arr[i + 2];
		}
	}

	public BackwardIterator createBackward() {
		return new BackwardIterator();
	}

	public Iterator anonymousIterator() {
		return new Iterator() {
			private int i = arr.length - 1;

			@Override
			public Integer next() {
				i -= 3;
				return arr[i + 3];
			}

			@Override
			public boolean hasnext() {
				return i >= 0;
			}
		};
	}

	public Iterator createLocaIterator() {
		class localIterator implements Iterator {
			private int i = 0;

			@Override
			public boolean hasnext() {
				return i < arr.length;
			}

			@Override
			public Integer next() {
				return arr[i++];
			}

		}
		return new localIterator();

	}

	static class StaticIterator implements Iterator {
		private int i = 0;

		@Override
		public boolean hasnext() {
			return i < arr.length;
		}

		@Override
		public Integer next() {
			return arr[i++];
		}

	}

	static StaticIterator createStaticIterator() {
		return new StaticIterator();
	}

}
