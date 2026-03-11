//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


void main() {
    List list = new ArrayList();
    list.add(10);

    String s = (String) list.get(0);  // 💥 ClassCastException
}
