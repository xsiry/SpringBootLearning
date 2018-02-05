define([
    { field: 'username', title: '登录账号', sortable: true, halign: 'center' },
    { field: 'relName', title: '真实姓名', sortable: true, halign: 'center' },
    { field: 'gender', title: '性别', sortable: true, halign: 'center' },
    { field: 'mobile', title: '手机', sortable: true, halign: 'center' },
    { field: 'idCard', title: '身份证', sortable: true, halign: 'center' },
    { field: 'createdAt', title: '添加时间', sortable: true, halign: 'center' },
    { field: 'roleId', title: '用户类型', sortable: true, halign: 'center' },
    { field: 'state', title: '状态', sortable: true, halign: 'center' },
    { field: 'action', title: '操作', halign: 'center', align: 'center', formatter: actionFormatter, events: 'actionEvents', clickToSelect: false }
]);

function actionFormatter(value, row, index) {
    var lock = '<a class="lock ml10" href="javascript:void(0)" data-toggle="tooltip" title="lock"><i class="glyphicon glyphicon-lock"></i></a>　';
    var del = '<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-remove"></i></a>　';
    if (row.roleId === "管理员") lock = del = '';
    return [
        lock,
        '<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="Edit"><i class="glyphicon glyphicon-edit"></i></a>　',
        del
    ].join('');
}
