/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, {useEffect} from 'react';
import type {PropsWithChildren} from 'react';
import {
  Button,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  useColorScheme,
} from 'react-native';

import {Colors} from 'react-native/Libraries/NewAppScreen';
import Home from './src/layout/home';
import {NativeModules} from 'react-native';

function App(): JSX.Element {
  const isDarkMode = useColorScheme() === 'dark';
  const {ZonkaSdkModile} = NativeModules;

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  useEffect(() => {
    // console.log(
    //   '🚀 ~ file: App.tsx:26 ~ App ~ ZonkaSdkModile:',
    //   ZonkaSdkModile.,
    // );
    console.log('hello');
  }, []);

  return (
    <>
      <Home />
    </>
  );
}

export default App;
