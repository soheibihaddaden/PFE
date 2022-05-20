from hashlib import new
from pickle import TRUE
from nltk.tokenize import word_tokenize

#  Binary Tree node
'''class Node :
	
	def __init__(self, data) :
		#  Set node value
		self.data = data
		self.left = None
		self.right = None
	

# Stack Node
class StackNode :
	
	def __init__(self, element, indicator) :
		self.element = element
		self.next = None
		self.indicator = indicator
	

# Define custom stack and its operation
class MyStack :
	
	def __init__(self) :
		self.top = None
		self.length = 0
	
	# Add a new element in stack
	def push(self, element, indicator) :
		# Make a new stack node
		new_node = StackNode(element, indicator)
		if (new_node != None) :
			new_node.next = self.top
			self.top = new_node
			self.length += 1
		else :
			print("Memory overflow\n", end = "")
		
	
	# remove a top element in stack
	def pop(self) :
		if (self.top != None) :
			self.top = self.top.next
			self.length -= 1
		
	
	# check that whether stack is empty or not
	def is_empty(self) :
		if (self.top != None) :
			return False
		else :
			return True
		
	
	def is_size(self) :
		return self.length
	
	# Used to get top element of stack
	def peek(self) :
		if (self.top != None) :
			return self.top.element
		else :
			return None
		
	

# Define Binary Tree 
class BinaryTree :
	
	def __init__(self) :
		# Set root of tree
		self.root = None
		self.location = 0
	
	# Display inorder elements
	def print_inorder(self, node) :
		if (node != None) :
			self.print_inorder(node.left)
			# Print node value
			print("  ", node.data, end = "")
			self.print_inorder(node.right)
		
	
	# Display pre order elements
	def print_preorder(self, node) :
		if (node != None) :
			# Print node value
			print("  ", node.data, end = "")
			self.print_preorder(node.left)
			self.print_preorder(node.right)
		
	
	# Display postorder elements
	def print_postorder(self, node) :
		if (node != None) :
			self.print_postorder(node.left)
			self.print_postorder(node.right)
			# Print node value
			print("  ", node.data, end = "")
		
	
	# Constructing a binary tree from string 
	#  1) expression can be contains positive number example (1,44,2324,55 etc)
	#  2) Expression contains parentheses which is indicates is left and right child
	#   Example 1 : () null child, other (4) child with node 4 
	def construct_tree(self, str, n) :
		#  Define loop controlling variable
		i = 0
		#  Define stack variable
		stack = MyStack()
		#  Define some useful Tree node variables
		auxiliary = None
		temp = None
		child = None
		parent = None
		#  Define some auxiliary variables
		num = 0
		position = 0
		# Display given expression
		print("\n Expression : ", str )
		# Construct tree
		while (i < n) :
			if (str[i] == '(') :
				#  Add null node
				temp = None
				stack.push(temp, 0)
				i += 1
			
			elif(str[i] == ')') :
				if (stack.is_size() < 2) :
					# not a valid parent child relation
					return None
				
				position = 0
				#  Reset the value of parent and child node
				child = None
				parent = None
				if (stack.is_empty() == False) :
					# Get child node
					child = stack.peek()
					stack.pop()
				
				if (stack.is_empty() == False) :
					# Get parent node
					parent = stack.peek()
					position = stack.top.indicator
					stack.pop()
				
				if (parent != None) :
					# connect parent to child node
					if (position == 0) :
						#  Add node in left side
						parent.left = child
						position = 1
					
					elif(position == 1) :
						#  Add node in right side
						parent.right = child
						position = 2
					else :
						#  Tree exist More than 2 child nodes
						#  example  x(1)(2)(3) x is parent
						print("\n More than 2 child of node ", parent.data )
						return None
					
					stack.push(parent, position)
				
				i += 1
			
			elif(ord(str[i]) >= ord('1') and ord(str[i]) <= ord('9')) :
				num = 0
				#  Collect node value
				while (i < n and str[i] != '('
					and str[i] != ')') :
					num = (num * 10) + (ord(str[i]) - ord('0'))
					i += 1
				
				#  Get new tree node
				temp = Node(num)
				if (stack.is_empty() == False) :
					auxiliary = stack.peek()
					if (auxiliary == None) :
						#  When stack top node element is empty then add new node to this location
						stack.top.element = temp
					else :
						#  Add new node in tree
						stack.push(temp, 0)
					
				else :
					#  When stack is empty, then add first node
					stack.push(temp, 0)
				
			else :
				#  When not a valid expression
				print("\n Invalid Expression \n", end = "")
				return None
			
		
		if (stack.is_empty() == False) :
			auxiliary = stack.peek()
			stack.pop()
			return auxiliary
		else :
			return None
		
	
	# handles the request of construct binary tree
	def make_tree(self, str, n) :
		if (n <= 0) :
			# Invalid sequence
			self.root = None
		else :
			self.root = self.construct_tree(str, n)
		
	
	# Handles the request of display the element of tree 
	def print_tree(self) :
		if (self.root == None) :
			print("\n Empty Tree\n", end = "")
			return
		
		print("\n Preorder : ", end = "")
		self.print_preorder(self.root)

	

def main() :
	# Create tree object
	tree = BinaryTree()
	#  string expression
	str = "(213(15(hello))"
	#  Get the size
	size = len(str)
	tree.make_tree(str, size)
	# 
	# 		            16
	# 		          /    \
	# 		         /      \
	# 		        /        \
	# 		       7         8
	# 		      /  \     /   \
	# 		     4    2   9     3
	# 		      \        \   /  
	# 		       6        1 15  
	# 		    ----------------  
	# 		    Resultant binary tree
	# 		    
	
	tree.print_tree()

if __name__ == "__main__":
     main()
'''
def converTodec(text):
   i=0
   for charactere in text:
    i+=ord(charactere) 
   return i
 
liste_token=[]
liste_tokendec=[]
text = "(ng (ng1 (nominal_term (noun NN)) (nominal_term (noun NNS)) (nominal_term (mesure_indicator amount))))"
for token in word_tokenize(text):
    liste_token.append(token)
    if(token!=')' and token!='('):
     liste_tokendec.append(str(converTodec(token)))
    else :liste_tokendec.append(token)  


listedec=[]
#print(''.join(liste_tokendec))
for token in word_tokenize(' '.join(liste_tokendec)) :
 listedec.append(token)
print(liste_token)    

k=0
newliste=[]
for i,elm in enumerate(liste_token):
	if elm!='(' and elm!=')':
		if liste_token[i-1]!='(' and liste_token[i-1]!=')':
			newliste.append("--->")
			newliste.append(elm)
		else:newliste.append(elm)
	else:newliste.append(elm)
newliste2=[]
for i ,elm in enumerate(newliste):
	if elm=='--->':
		j=i-2
		if newliste[j]=='(' and j!=0:
			newliste.insert(j-1,'--->')
			
				
print(newliste)
#print(listedec)

