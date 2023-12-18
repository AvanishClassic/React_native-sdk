import axios from "axios";
import { retrieveData } from "../store/asyncStorage/asyncStorage";
import Constant from "../utils/constant";

// Function to get the base URL based on the region
const getBaseUrlForServerHost = async () => {
  const zfRegion = await retrieveData(Constant.ZF_REGION);
  let baseUrl = "";
  if (zfRegion && zfRegion.toUpperCase() === "EU") {
    baseUrl = Constant.HTTPS + "e" + Constant.RETROFIT_URL;
  } else {
    // Handle other regions or use a default URL
    baseUrl = Constant.HTTPS + "us1" + Constant.RETROFIT_URL;
  }
  return baseUrl;
};

const getBaseUrlForContactTracking = async () => {
  const zfRegion = await retrieveData(Constant.ZF_REGION);
  let baseUrl = "";
  if (zfRegion && zfRegion.toUpperCase() === "EU") {
    baseUrl = "https://e.apis.zonkafeedback.com/";
  } else {
    // Handle other regions or use a default URL
    baseUrl = "https://us1.apis.zonkafeedback.com/";
  }
  return baseUrl;
};

export const ApiManager = async () => {
  const baseUrlForServerHost: string = await getBaseUrlForServerHost();
  const baseUrlContactTracking: string = await getBaseUrlForContactTracking();

  const apiServerHostClient = axios.create({
    baseURL: baseUrlForServerHost,
    timeout: 10000, // Adjust the timeout as needed
    headers: {
      Accept: "application/json",
      "x-rapidapi-host": "famous-quotes4.p.rapidapi.com",
      "x-rapidapi-key": "<your-key-here>",
    },
  });

  // const setBaseUrl = async() => {
  //   apiServerHostClient?.defaults?.baseURL =await getBaseUrl();
  // };

  return apiServerHostClient;
};
