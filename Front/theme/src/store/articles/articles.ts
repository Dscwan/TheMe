// import router from '@/router'
import rest from '@/API/rest'
// import { storage } from '../firebase/firebase'

import axios from "axios"
export default {
    state: {
        feedArticleList: [{ themeName: "tttasdgfa" }, { themeName: "임시2"}]
    },
    getters: {
        getFeedArticleList: (state: {feedArticleList : Array<object>}) => state.feedArticleList,
        
    },
    mutations: {
        SET_FEED_ARTICLE_LIST: (state: {feedArticleList : Array<object>}, _list:Array<object>) => state.feedArticleList = _list

    },
    actions: {
        getFeedArticleList({ getters }: {getters:any},_region:number) {
            axios({
                url: rest.Feed.feedList(),
                method: 'get',
                headers: getters.authHeader,
                params: { region: _region}  
            })
        },
        // articleImageUpload(_imageFile: File, _fileName: string) {
        //     // const storageRef = storage.ref();
        //     // const imagePath = storageRef.child(`article/${_fileName}`)
        //     // imagePath.put(_imageFile)
        // }

    }
}