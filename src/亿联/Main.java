package 亿联;


import java.util.*;

public class Main {
    List<Node> nodeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] level = new int[]{2};//读取finish后面的数字，一层层取节点
        Main tree = new Main();
        try {
            while (true) {
                String newLine = scan.nextLine();
                if (newLine.startsWith("finish")) {
                    String[] tmp = newLine.substring("finish".length()).trim().split("\\s");
                    level = new int[tmp.length];
                    for (int i = 0; i < tmp.length; i++) {
                        level[i] = Integer.parseInt(tmp[i]);
                    }
                    break;
                }
                String[] param = newLine.split("\\s+");
                tree.addNode(param[0], param[1], Integer.parseInt(param[2]), param.length > 3 ? param[3] : null);
            }
        } finally {
            scan.close();
        }
        tree.sort();
        List<Node> root = tree.getRoot();
        Node target = new Node();
        target.setChildren(root);
        for (int i = 0; i < level.length; i++) {
            List<Node> children = target.getChildren();
            if (children != null && children.size() > level[i] - 1) {
                target = children.get(level[i] - 1);
            } else {
                target = null;
                break;
            }
        }
        if (target != null) {
            System.out.printf("%s %s\n", target.getId(), target.getName());
        } else {
            System.out.println("nofound");
        }
    }

    public void addNode(String id, String name, int type, String parentId) {
        //实现添加节点方法
        Node node = new Node(id, name, parentId, type);
        nodeList.add(node);
    }

    public void sort() {
        //实现树形结构的初始化和排序
        List<Node> type0 = new ArrayList<>();
        List<Node> type1 = new ArrayList<>();
        for (Node node : nodeList) {
            if (node.getType() == 0) {
                type0.add(node);
            } else {
                type1.add(node);
            }
            nodeList.remove(node);
        }
        type0.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.getId().compareTo(o1.getId());
            }
        });
        type1.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        nodeList.addAll(type0);
        nodeList.addAll(type1);
    }

    public List<Node> getRoot() {
        List<Node> list = new ArrayList<>();
        for (Node node : nodeList) {
            if (node.getParentId() == null) {
                list.add(node);
            }
        }
        list.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.getParentId().compareTo(o1.getParentId());
            }
        });
        return list;//所有parentId为null的根节点列表，注意排序
    }
}

class Node {
    private List<Node> children;
    private String id;
    private String name;
    private String parentId;
    private int type;

    public Node() {
    }
    //其他方法自行实现

    public Node(String id, String name, String parentId, int type) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.type = type;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> node) {
        children = node;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public int getType() {
        return type;
    }
}

