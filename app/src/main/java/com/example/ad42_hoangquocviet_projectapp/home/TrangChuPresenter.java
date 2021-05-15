package com.example.ad42_hoangquocviet_projectapp.home;

public class TrangChuPresenter {


    String AIPvideo = "https://demo1913415.mockable.io/GetItemCategoryTwo";



//    class GetDataDemo extends AsyncTask<Void,Void,String> {
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected String doInBackground(Void... voids) {
//            String result = "";
//            try {
//                URL url = new URL(AIPvideo);
//                URLConnection connection = url.openConnection();
//                InputStream is = connection.getInputStream();
//
//                int byteCharacter;
//                while ((byteCharacter = is.read())!= -1){
//                    result += (char)byteCharacter;
//                }
////
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            return result;
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            String res = "";
//            //binding.tvTextView.setText(s);
//            try {
//                JSONArray jsonArray = new JSONArray(s);
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//
//                    String videoa = jsonObject.getString("avatar");
//                    String chanel = jsonObject.getString("avatar");
//                    String title = jsonObject.getString("title");
//                    String name = jsonObject.getString("artist_name");
//                    String viewxem= jsonObject.getString("view_clip_gold");
//                    String ngay = jsonObject.getString("date_created");
//
//
//                    VideoTT videoTT = new VideoTT(videoa,chanel,title,name,viewxem,ngay);
//                    videoTTList.add(videoTT);
//
////                    Glide.with(getContext()).load(videoa)
////                            .placeholder(R.drawable.ic_launcher_background)
////                            .into(R.id.img_video);
//
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }











}
