class Pair
 {
     TreeNode node;
     int num;
     Pair(TreeNode node,int num)
     {
         this.node=node;
         this.num=num;
     }
 }
 class Solution
 {
     public List<List<Integer>>PreInPostTraversal(TreeNode root)
     {
         List<Integer>pre=new ArrayList<>();
         List<Integer>in=new ArrayList<>();
         List<Integer>in=new ArrayList<>();
         
         if(root==null)
         {
             return Array.asList(pre,in,post);
         }
         Stack<Pair>st=new Stack<>();
         Pair p=new Pair(root,1);
         st.push(p);
         while(!st.isEmpty())
         {
             Pair it=st.pop();
             
             //preorder
             if(it.num==1)
             {
                 pre.add(it.node.val);
                 it.num++;
                 st.push(it);
                 if(it.node.left!=null)
                 {
                     Pair p=new Pair(it.node.left,1);
                     st.push(p);
                 }
             }
             //
             else if(it.num==1)
             {
                 in.add(it.node.val);
                 it.num++;
                 st.push(it);
                 if(it.node.right!=null)
                 {
                     Pair p=new Pair(it.node.right,1);
                     st.push(p);
                 }
             }
             //post order
             else
             {
                 post.add(it.node.val);
             }
             List<List<Integer>>ans=new ArrayList<>();
             ans.add(pre);
             ans.add(in);
             ans.add(post);
             
             return ans;
         }
         
     }
 }
