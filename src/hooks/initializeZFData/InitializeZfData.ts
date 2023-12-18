import { hitSurveyActiveApi } from "../../services/services";
import AppUtils from "../../utils/appUtils";

const InitializeZfData = async (token: string) => {
  if (await AppUtils.isNetworkConnected()) {
    const apiResponse = await hitSurveyActiveApi(token);
    console.log(
      "🚀 ~ file: InitializeZfData.ts:7 ~ InitializeZfData ~ apiResponse:",
      apiResponse
    );
  }
};

export default InitializeZfData;
