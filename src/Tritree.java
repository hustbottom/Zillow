class Tritree {
	int value;
	public Tritree left, right, middle;
	Tritree(int value){
		this.value = value;
	}
}
class Tree{
	Tritree root;
	void insert(Tritree node){
		if(root == null){
			root = node;
			return;
		}
		Tritree cur = root;
		while(cur != null){
			if(cur.value == node.value){
				while(cur.middle != null)
					cur = cur.middle;
				cur.middle = node;
				return;
			}else if(cur.value < node.value){
				if(cur.right != null){
					cur = cur.right;
					continue;
				}else{
					cur.right = node;
					return;
				}
			}else{
				if(cur.left != null){
					cur = cur.left;
					continue;
				}else{
					cur.left = node;
					return;
				}
			}
		}
	}
	void adjust(Tritree node, Tritree par){
		Tritree left = node.left, right = node.right;
		Tritree cur = node;
		if(node.middle != null){
			cur = node.middle;
			cur.left = left;
			cur.right = right;
		}else{
			if(left == null){
				cur = right;
			}else if(right == null){
				cur = left;
			}else{
				cur = left;
				while(left.right != null)
					left = left.right;
				left.right = right;
			}
		}
		if(par == null){
			root = cur;
		}else{
			if(par.left == node){
				par.left = cur;
			}else if (par.right == node){
				par.right = cur;
			}else
				par.middle = cur;
		}
	}
	
	int delete(int val){
		if(root == null)
			return -1;
		Tritree cur = root, parent = null;
		while(cur != null){
			if(cur.value == val){
				adjust(cur, parent);
				return 0;
			}else if(cur.value > val){
				parent = cur;
				cur = cur.left;
			}else{
				parent = cur;
				cur = cur.right;
			}
		}
		return -1;
	}

}
