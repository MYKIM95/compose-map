

/** app 모듈 의존성 주입 */
internal val appDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 컴포즈 */
        Implementation(Libs.Androidx.COMPOSE_ACTIVITY),
        Implementation(Libs.Androidx.COMPOSE_VIEW_MODEL),
        AndroidTestImplementation(Libs.Androidx.COMPOSE_JUNIT),
        DebugImplementation(Libs.Androidx.COMPOSE_UI_TOOLING),
        DebugImplementation(Libs.Androidx.COMPOSE_MANIFEST),

        /* 코루틴 */
        Implementation(Libs.JetBrains.COROUTINE_ANDROID),
        Implementation(Libs.JetBrains.COROUTINE_CORE),

        /* 구글 맵 */
        Implementation(Libs.GoogleMap.GOOGLE_MAP_COMPOSE),
        Implementation(Libs.GoogleMap.GOOGLE_MAP_COMPOSE_WIDGET),

        /* 네이버 맵 */
        Implementation(Libs.NaverMap.NAVER_MAP),
        Implementation(Libs.NaverMap.NAVER_MAP_COMPOSE),

        /* 플레이 서비스 */
        Implementation(Libs.GooglePlayServices.PLAY_SERVICES_MAP),
        Implementation(Libs.GooglePlayServices.PLAY_SERVICES_LOCATION),

        Implementation(Libs.Androidx.LIFECYCLE_RUNTIME),
        Implementation(Libs.Androidx.CORE),
        Implementation(Libs.Google.GSON),

        AndroidTestImplementation(Libs.Androidx.JUNIT),
        AndroidTestImplementation(Libs.Androidx.ESPRESSO_CORE),

        TestImplementation(Libs.Test.JUNIT)
    )

/** common-ui 모듈 의존성 주입 */
internal val commonUiDependencies: List<DependencyType>
    get() = listOf(
        /* 컴포즈 */
        Api(Libs.Androidx.COMPOSE_UI),
        Api(Libs.Androidx.COMPOSE_MATERIAL),
        Api(Libs.Androidx.COMPOSE_PREVIEW),
        Api(Libs.Coil.COIL),
        AndroidTestImplementation(Libs.Androidx.COMPOSE_JUNIT),
        DebugImplementation(Libs.Androidx.COMPOSE_UI_TOOLING),
        DebugImplementation(Libs.Androidx.COMPOSE_MANIFEST),
    )

/** common-util 모듈 의존성 주입 */
internal val commonUtilDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 컴포즈 */
        Implementation(Libs.Androidx.COMPOSE_ACTIVITY),

        /* 권한 */
        Implementation(Libs.Permission.PERMISSION),
        Implementation(Libs.Permission.PERMISSION_APPCOMPAT)
    )

/** common-model 모듈 의존성 주입 */
internal val commonModelDependencies : List<DependencyType>
    get() = listOf(
        Implementation(Libs.Google.GSON)
    )

/** core-datastore 모듈 의존성 주입 */
internal val coreDataStoreDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 코루틴 */
        Implementation(Libs.JetBrains.COROUTINE_ANDROID),
        Implementation(Libs.JetBrains.COROUTINE_CORE),

        Implementation(Libs.Google.GSON),
    )

/** core-network 모듈 의존성 주입 */
internal val coreNetworkDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 코루틴 */
        Implementation(Libs.JetBrains.COROUTINE_ANDROID),
        Implementation(Libs.JetBrains.COROUTINE_CORE),

        Implementation(Libs.NetWork.OKHTTP4),
        Implementation(Libs.NetWork.RETROFIT2),
        Implementation(Libs.NetWork.CONVERTER_GSON),
        Implementation(Libs.NetWork.CONVERTER_SCALARS),
        Implementation(Libs.NetWork.ADAPTER_COROUTINE),
    )

/** core-database 모듈 의존성 주입 */
internal val coreDataBaseDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 코루틴 */
        Implementation(Libs.JetBrains.COROUTINE_ANDROID),
        Implementation(Libs.JetBrains.COROUTINE_CORE),

        Implementation(Libs.Google.GSON),

        Implementation(Libs.Androidx.ROOM),
        Implementation(Libs.Androidx.ROOM_RUNTIME),
        Kapt(Libs.Androidx.ROOM_COMPILER),
    )

/** core-data 모듈 의존성 주입 */
internal val coreDataDependencies: List<DependencyType>
    get() = listOf(
        /* 힐트 */
        Implementation(Libs.Hilt.HILT_ANDROID),
        Kapt(Libs.Hilt.HILT_ANDROID_COMPILER),

        /* 코루틴 */
        Implementation(Libs.JetBrains.COROUTINE_ANDROID),
        Implementation(Libs.JetBrains.COROUTINE_CORE),
    )