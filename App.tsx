/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import { NativeModules } from "react-native";
import {
  saveCookieId,
  saveFirstSeen,
  storeData,
} from "./src/store/asyncStorage/asyncStorage";
import Constant from "./src/utils/constant";
import InitializeZfData from "./src/hooks/initializeZFData/InitializeZfData";
import Home from "./src/layout/home";
import { useEffect } from "react";

function App(): JSX.Element {
  const { ZfSurveyModule } = NativeModules;

  const init = (token: string, region: string) => {
    if (!!token && !!region) {
      storeData(Constant.ZF_REGION, region);
      saveFirstSeen();
      saveCookieId();
      InitializeZfData(token);
    }
  };

  useEffect(() => {
    ZfSurveyModule.callZfSurvey((token: any, region: any) => {
      init(token, region);
    });
  }, []);

  return <Home />;
}

export default App;
