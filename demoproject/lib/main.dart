import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'From Scratch...',
        home: Scaffold(
          appBar: AppBar(
            title: const Text('Scratch'),
            backgroundColor: Colors.limeAccent,
          ),
          body: const Padding(
            padding: EdgeInsets.all(16.0),
            child: Row(
              children: [
                Icon(
                  Icons.account_circle,
                  size: 50,
                  color: Colors.blue,
                ),
                SizedBox(
                  width: 10,
                ),
                Text(
                  'From Scratch',
                  style: TextStyle(fontSize: 40),
                ),
              ],
            ),
          ),
          bottomNavigationBar: BottomNavigationBar(
            items: const [
              BottomNavigationBarItem(label: 'Home', icon: Icon(Icons.home)),
              BottomNavigationBarItem(label: 'Phone', icon: Icon(Icons.phone)),
              BottomNavigationBarItem(
                  label: 'Settings', icon: Icon(Icons.settings)),
            ],
          ),
        ));
  }
}
