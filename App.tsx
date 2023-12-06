/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React, {useEffect} from 'react';

import Home from './src/layout/home';
import {NativeModules} from 'react-native';

function App(): JSX.Element {
  const {ZfSurveyModule} = NativeModules;

  const init = (token: string, region: string) => {
    if (!!token && !!region) {
    }
  };

  useEffect(() => {
    ZfSurveyModule.callZfSurvey((token: any, region: any) => {
      init(token, region);
    });
  }, []);

  return (
    <>
      <Home />
    </>
  );
}

export default App;
