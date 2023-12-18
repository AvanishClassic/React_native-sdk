import { ApiManager } from "./apiManage";

export const hitSurveyActiveApi = async (token: string) => {
  const apiServerHostClient = await ApiManager();
  try {
    const response = await apiServerHostClient.get(
      `distribution/validateCode/returnResponse/${token}`
    );
    // Assuming Widget is the expected response type
    const widgetData = response.data;
    console.log(widgetData); // Handle the widget data as needed
    return widgetData;
  } catch (error) {
    console.error("Error in API call:", error);
    // Handle the error as needed
    throw error;
  }
};
