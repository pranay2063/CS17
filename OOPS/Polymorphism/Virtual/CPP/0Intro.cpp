#include <iostream>
using namespace std;

class base{
	public:
	void show() { cout<<"Welcome to Base!"<<endl; }
};

class derived : public base{
	public:
	void show() { cout<<"Welcome to Derived!"<<endl; }
};

int main() {
	base objb;
	derived objd;
	objb.show();
	objd.show();
	return 0;
}
